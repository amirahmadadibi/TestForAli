package projects.com.amirahmadadibi.myapplication;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CarItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    Context context;
    List<Car> cars;

    public CarItemAdapter(Context context, List<Car> cars) {
        this.context = context;
        this.cars = cars;
    }

    //create frame card
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_item, viewGroup, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.txtCarName.setText(cars.get(i).getName());
        itemViewHolder.txtCarModel.setText(String.valueOf(cars.get(i).getModel()));
        itemViewHolder.txtCarPrice.setText(String.valueOf(cars.get(i).getPrice()));
        Log.d("recyclerview", "onBindViewHolder: " + cars.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
