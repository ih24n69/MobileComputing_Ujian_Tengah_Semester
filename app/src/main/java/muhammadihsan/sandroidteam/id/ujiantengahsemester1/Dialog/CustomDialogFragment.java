package muhammadihsan.sandroidteam.id.ujiantengahsemester1.Dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import muhammadihsan.sandroidteam.id.ujiantengahsemester1.R;

/**
 * Created by MuhammadIhsan on 19/04/2017.
 */

public class CustomDialogFragment extends DialogFragment {
    private final String TAG = "AUC_CUSTOM";
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setTitle("Masukan Nama Anda");
        builder.setPositiveButton("OK",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                Log.i(TAG,"Ok clicked");
            }
        });
        builder.setNegativeButton("Cancel",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){
                Log.i(TAG,"Cancel clicked");
            }
        });
        builder.setView(v);
        return builder.create();
    }
}
