package id.sch.smktelkom_mlg.learn.intent1;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class HasilActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
