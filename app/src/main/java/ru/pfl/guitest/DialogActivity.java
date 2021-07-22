package ru.pfl.guitest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

public class DialogActivity extends AppCompatActivity {

    Button buttonDialogShow;
    FragmentManager fragmentManager;
    MyDialogFragment dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        fragmentManager = getSupportFragmentManager();
        dialog = new MyDialogFragment();

        buttonDialogShow = findViewById(R.id.buttonDialogShow);
        buttonDialogShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show(fragmentManager, "dialog_tag");
            }
        });
    }

    public static class MyDialogFragment extends DialogFragment {
        @NonNull
        @NotNull
        @Override
        public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
            // Use the Builder class for convenient dialog construction
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage("My dialog")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getContext(), "Ok", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getContext(), "Cancel", Toast.LENGTH_SHORT).show();
                        }
                    });
            // Create the AlertDialog object and return it
            return builder.create();
            //return super.onCreateDialog(savedInstanceState);
        }
    }
}