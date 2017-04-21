package muhammadihsan.sandroidteam.id.ujiantengahsemester1.Dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;

/**
 * Created by MuhammadIhsan on 19/04/2017.
 */

public class SimpleChoiceFragment extends DialogFragment {
    private final String TAG = "AUC_COMPLEX";
    private final String[] colors = {"RED","BLUE","GREEN","YELLOW"};

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("What is your fav color?");
        builder.setItems(colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Log.i(TAG, String.format("Color chosen: %s",colors[i]));
            }
        });

        return builder.create();
    }
}
