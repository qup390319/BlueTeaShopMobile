package com.example.blueteashopmobile;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<String>mData;
    MyAdapter(List<String>data){
        mData=data;
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txt1;
        public ViewHolder(View itemView){
            super(itemView);
            txt1=(TextView) itemView.findViewById(R.id.txt1) ;
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // 設置txtItem要顯示的內容
        holder.txt1.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}