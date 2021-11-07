package com.example.blueteashopmobile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShoppingCartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */


public class ShoppingCartFragment extends Fragment {
    private Button btn_sent;
    private RecyclerView rcv;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyAdapter adapter;
    private ArrayList<String> mData=new ArrayList<>();

    String url = "https://f24b-2001-b011-b800-9666-a5b6-e17-6e1-3f0c.ngrok.io/api/tickets/";
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShoppingCartFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShoppingCartFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShoppingCartFragment newInstance(String param1, String param2) {
        ShoppingCartFragment fragment = new ShoppingCartFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_shopping_cart, container, false);
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        btn_sent= (Button) root.findViewById(R.id.btn_sent);
        rcv=root.findViewById(R.id.rcv);
        rcv.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(root.getContext());
        rcv.setLayoutManager(mLayoutManager);
        adapter=new MyAdapter(mData);
        rcv.setAdapter(adapter);

        btn_sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Request request = new Request.Builder()
                        .url("https://f24b-2001-b011-b800-9666-a5b6-e17-6e1-3f0c.ngrok.io/api/tickets/")
                        .build();
                // 建立Call
                Call call = client.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                    }
                    @Override
                    public void onFailure(Call call, IOException e) {
                    }
                });
            }
        });
        return inflater.inflate(R.layout.fragment_shopping_cart, container, false);
    }
}

