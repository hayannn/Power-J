package com.example.powerj;

import static android.content.Context.MODE_NO_LOCALIZED_COLLATORS;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;

public class Fragmentdiary extends Fragment {
    private String fileName;
    private DatePicker datePicker;
    private TextView viewDatePick;
    private EditText edtDiary;
    private Button btnSave;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_diary,container);
        datePicker = view.findViewById(R.id.datePicker);
        viewDatePick = view.findViewById(R.id.viewDatePick);
        edtDiary = view.findViewById(R.id.edtDiary);
        btnSave = view.findViewById(R.id.btnSave);
        return view;

    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        Calendar c = Calendar.getInstance();
        int cYear = c.get(Calendar.YEAR);
        int cMonth = c.get(Calendar.MONTH);
        int cDay = c.get(Calendar.DAY_OF_MONTH);

        checkedDay(cYear,cMonth,cDay);

        datePicker.init(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                checkedDay(year,monthOfYear,dayOfMonth);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveDiary(fileName);
            }
        });
    }
    private void checkedDay(int year, int monthOfYear, int dayOfMonth) {

        // 받은 날짜로 날짜 보여주는
        viewDatePick.setText(year + " - " + monthOfYear + " - " + dayOfMonth);

        // 파일 이름을 만들어준다. 파일 이름은 "20170318.txt" 이런식으로 나옴
        fileName = year + "" + monthOfYear + "" + dayOfMonth + ".txt";

        // 읽어봐서 읽어지면 일기 가져오고
        // 없으면 catch 그냥 살아? 아주 위험한 생각같다..
        FileInputStream fis = null;
        try {
            fis = getActivity().openFileInput(fileName);

            byte[] fileData = new byte[fis.available()];
            fis.read(fileData);
            fis.close();

            String str = new String(fileData, "EUC-KR");
            // 읽어서 토스트 메시지로 보여줌
            Toast.makeText(getActivity(), "일기 써둔 날", Toast.LENGTH_SHORT).show();
            edtDiary.setText(str);
            btnSave.setText("수정하기");
        } catch (Exception e) { // UnsupportedEncodingException , FileNotFoundException , IOException
            // 없어서 오류가 나면 일기가 없는 것 -> 일기를 쓰게 한다.
            Toast.makeText(getActivity(), "일기 없는 날", Toast.LENGTH_SHORT).show();
            edtDiary.setText("");
            btnSave.setText("새 일기 저장");
            e.printStackTrace();
        }

    }

    // 일기 저장하는 메소드
    private void saveDiary(String readDay) {

        FileOutputStream fos = null;

        try {
            fos = getActivity().openFileOutput(readDay, Context.MODE_PRIVATE); //MODE_WORLD_WRITEABLE
            String content = edtDiary.getText().toString();

            // String.getBytes() = 스트링을 배열형으로 변환?
            fos.write(content.getBytes());
            //fos.flush();
            fos.close();

            // getApplicationContext() = 현재 클래스.this ?
            Toast.makeText(getActivity(), "일기 저장됨", Toast.LENGTH_SHORT).show();

        } catch (Exception e) { // Exception - 에러 종류 제일 상위 // FileNotFoundException , IOException
            e.printStackTrace();
            Toast.makeText(getActivity(), "오류오류", Toast.LENGTH_SHORT).show();
        }
    }
}