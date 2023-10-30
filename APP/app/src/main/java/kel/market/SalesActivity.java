package kel.market;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SalesActivity extends AppCompatActivity {

    private TableLayout tableLayoutSales;
    private Button buttonDownloadXlsx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sales_activity);

        // Initialize UI elements
        tableLayoutSales = findViewById(R.id.tableLayoutSales);
        buttonDownloadXlsx = findViewById(R.id.buttonDownloadXlsx);

        // Set a click listener for the "Download as XLSX" button
        buttonDownloadXlsx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Implement logic to download data as XLSX
            }
        });

        // For demonstration purposes, add a sample row to the table
        addTableRow("2023-11-01", "5000", "4500", "500", "200", "3500", "30%", "4000");
    }

    private void addTableRow(String date, String grossSales, String salesNoTax,
                             String tax, String discount, String grossProfit,
                             String margin, String avgSales) {
        TableRow tableRow = new TableRow(this);
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT);
        tableRow.setLayoutParams(layoutParams);
        tableRow.setBackgroundResource(R.drawable.table_row_background);

        // Add TextViews for each column
        addTextViewToRow(date, tableRow);
        addTextViewToRow(grossSales, tableRow);
        addTextViewToRow(salesNoTax, tableRow);
        addTextViewToRow(tax, tableRow);
        addTextViewToRow(discount, tableRow);
        addTextViewToRow(grossProfit, tableRow);
        addTextViewToRow(margin, tableRow);
        addTextViewToRow(avgSales, tableRow);

        // Add the TableRow to the TableLayout
        tableLayoutSales.addView(tableRow);
    }

    private void addTextViewToRow(String text, TableRow tableRow) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setPadding(8, 8, 8, 8);
        tableRow.addView(textView);
    }
}
