package projects.com.amirahmadadibi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_main);
        //Adatper adapter = new Adapter(layoutItem,name[]);
        //ItemAdapter ada = new Adatper(carlist);
        Car car1 = new Car("pagani1", 1998, 12.000000);
        Car car2 = new Car("pagani2", 1998, 12.000000);
        Car car3 = new Car("pagani3", 1998, 12.000000);
        Car car4 = new Car("pagani4", 1998, 12.000000);
        Car car5 = new Car("pagani5", 1998, 12.000000);
        Car car6 = new Car("pagani6", 1998, 12.000000);
        Car car7 = new Car("pagani7", 1998, 12.000000);
        Car car8 = new Car("pagani8", 1998, 12.000000);
        Car car9 = new Car("pagani9", 1998, 12.000000);
        Car car10 = new Car("pagani010", 1998, 12.000000);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        CarItemAdapter carItemAdapter = new CarItemAdapter(this,cars);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(carItemAdapter);
    }
}
