package com.example.applicationtext3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ResultFragment extends android.app.Fragment {
    String[] strings = new String[]{"您可在此设置用户信息","您可在此进行音量设置","您可在此进行安全设置",
            "您可在此设置亮度","其他设置"};
    //    创建实例，拿到数据
    public static ResultFragment newInstance(int aIndex){
        ResultFragment resultFragment = new ResultFragment();
        Bundle bundle = new Bundle();
//        把aIndex作为参数存进bundle中
        bundle.putInt("aIndex",aIndex);
        resultFragment.setArguments(bundle);
        return resultFragment;
    }
    //    得到索引方法
    public int getShownIndex(){
        return getArguments().getInt("aIndex",0);
    }
    //    创建一个文本视图
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null){
            return null;
        }
        ScrollView scrollView = new ScrollView(getActivity());
        TextView textView = new TextView(getActivity());
        textView.setPadding(10,10,10,10);
        scrollView.addView(textView);
        textView.setText(strings[getShownIndex()]);
        return scrollView;
    }
}
