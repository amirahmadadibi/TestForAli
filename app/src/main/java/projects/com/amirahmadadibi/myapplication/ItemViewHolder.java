package projects.com.amirahmadadibi.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView txtCarName;
    TextView txtCarModel;
    TextView txtCarPrice;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        txtCarName = itemView.findViewById(R.id.txt_car_name);
        txtCarModel = itemView.findViewById(R.id.txt_car_model);
        txtCarPrice = itemView.findViewById(R.id.txt_car_price);
    }
}
