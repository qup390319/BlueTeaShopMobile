package com.example.blueteashopmobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class Order_Data{
    int ticket_id;
    String items;
    Integer total;
    public Order_Data(int i,String txt1,String sug,String ice,Integer money){
        ticket_id=i;
        items=txt1+sug+ice;
        total=money;
    }
}
public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {
    private List<String> OrderData;
    OrderAdapter(List<String>Ordata){
        OrderData = Ordata;
    }

    class OrderViewHolder extends RecyclerView.ViewHolder{
        private TextView txt1;
        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=(TextView) itemView.findViewById(R.id.txt1);
        }
    }
    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_drink,parent,false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.OrderViewHolder holder, int position) {
        holder.txt1.setText(OrderData.get(position));
    }

    @Override
    public int getItemCount() {
        return OrderData.size();
    }
}
