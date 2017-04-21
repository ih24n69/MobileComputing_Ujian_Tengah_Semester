package muhammadihsan.sandroidteam.id.ujiantengahsemester1;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import muhammadihsan.sandroidteam.id.ujiantengahsemester1.Dialog.CustomDialogFragment;
import muhammadihsan.sandroidteam.id.ujiantengahsemester1.Dialog.SimpleChoiceFragment;
import muhammadihsan.sandroidteam.id.ujiantengahsemester1.Dialog.SimpleDialogFragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="AUC_SIMPLE" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent inten1 = new Intent(this,SettingsActivity.class);
            startActivity(inten1);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showToast(View view) {
       Toast.makeText(this, "Ini Contoh Toast", Toast.LENGTH_SHORT).show();
    }

    public void showTostCustom(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast_layout, (ViewGroup)findViewById(R.id.customToastLayout));
        TextView tv = (TextView)layout.findViewById(R.id.textContent);
        tv.setText("Ini Custom Toast");
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
        toast.setView(layout);
        toast.show();
    }

    public void keSimpleDialog(View view) {
        //bila menggunakan activity yg berdiri sendiri
        /*Intent intent2 = new Intent(this, SimpleActivity.class);
        startActivity(intent2);*/

        //langsung memanggil aksi tanpa memanggil activity dulu
        SimpleDialogFragment dialogSimple = new SimpleDialogFragment();
        dialogSimple.show(getSupportFragmentManager(), "SimpleDialogFragment");
    }

    public void keCustomDialog(View view) {
        //langsung memanggil aksi tanpa memanggil activity dulu
        CustomDialogFragment dialogCustom = new CustomDialogFragment();
        dialogCustom.show(getSupportFragmentManager(), "CustomDialogFragment");
    }

    public void keChoiceDialog(View view) {
        SimpleChoiceFragment choiceDialog = new SimpleChoiceFragment();
        choiceDialog.show(getSupportFragmentManager(), "SimpleChoiceFragment");
    }

    public void keDatePicker(View view) {
        Calendar cal = Calendar.getInstance();
        DatePickerDialog datePicker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Log.i(TAG, String.format("Date choosen -- day: %d, month: %d, year: %d",dayOfMonth, month, year));

            }
        },cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        datePicker.setTitle("Choose a Date");
        datePicker.show();
    }
}
