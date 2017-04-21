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

public class SimpleDialogFragment extends DialogFragment {
    public  final String TAG="AUC_SIMPLE";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        // AlertDialog.Builder instance
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //builder properties
        builder.setTitle("Peas Preference");
        builder.setMessage("Do you like Your Self??");
        builder.setPositiveButton("Sure !",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){
                Log.i(TAG,"Positive Button clicked");
            }
        });
        builder.setNegativeButton("No!",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){
                Log.i(TAG,"Negative Button clicked");
            }
        });
        builder.setNeutralButton("Not Sure",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){
                Log.i(TAG,"Neutral Button clicked");
            }
        });
        return builder.create();
    }
    public void onCancel(DialogInterface dlg){
        super.onCancel(dlg);
        Log.i(TAG,"Dialog Cancelled");
    }
}
