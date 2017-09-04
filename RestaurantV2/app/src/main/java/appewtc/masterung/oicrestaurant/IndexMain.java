package appewtc.masterung.oicrestaurant;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by AloneBOY on 03/09/2017.
 */

public class IndexMain extends ActionBarActivity {
    String strOfficer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_main);

        strOfficer = getIntent().getExtras().getString("Officer");

//        bindWidget();
    }

    private void bindWidget() {

    }

    public void clickOrder(View view){
        Button btn_oko = (Button)findViewById(R.id.btt_order);
        Intent intent = new Intent(IndexMain.this, TableActivity.class);
        intent.putExtra("Officer", strOfficer);
        startActivity(intent);
    }
    /*public void clickCook(View view){
        Button btn_okc = (Button)findViewById(R.id.btt_cook);
        Intent intent = new Intent(IndexMain.this, TableActivity.class);
        intent.putExtra("Officer", strOfficer);
        startActivity(intent);
    }*/
}
