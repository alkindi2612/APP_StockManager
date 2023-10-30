package kel.market;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class PurchaseActivity extends AppCompatActivity {

    private ListView listViewPurchase;
    private Button buttonAddItem;
    private List<String> purchaseDataList;
    private ArrayAdapter<String> purchaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembelian);

        listViewPurchase = findViewById(R.id.listViewPurchase);
        buttonAddItem = findViewById(R.id.buttonAddItem);

        purchaseDataList = new ArrayList<>();
        purchaseAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, purchaseDataList);
        listViewPurchase.setAdapter(purchaseAdapter);

        buttonAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItemToPurchase();

                purchaseAdapter.notifyDataSetChanged();
            }
        });
    }

    private void addItemToPurchase() {
        String newItem = "Item " + (purchaseDataList.size() + 1);
        purchaseDataList.add(newItem);

        Toast.makeText(this, "Item added to purchase: " + newItem, Toast.LENGTH_SHORT).show();
    }
}