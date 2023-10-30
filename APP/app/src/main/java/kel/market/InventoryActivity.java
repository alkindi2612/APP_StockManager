package kel.market;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stock);

        String[] inventoryData = {"Susu", "Roti", "Kopi", "Teh"};
        ListView listViewInventory = findViewById(R.id.listViewInventory);
        ArrayAdapter<String> inventoryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, inventoryData);
        listViewInventory.setAdapter(inventoryAdapter);

        String[] salesData = {"ex 1", "ex 2", "ex 3", "ex 4"};
        ListView listViewSales = findViewById(R.id.listViewSales);
        ArrayAdapter<String> salesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, salesData);
        listViewSales.setAdapter(salesAdapter);
    }
}