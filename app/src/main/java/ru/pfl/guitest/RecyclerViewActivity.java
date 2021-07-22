package ru.pfl.guitest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<RecyclerItem> items = new ArrayList<>();
    private RecyclerView.Adapter adapter = new ItemAdapter(items);

    RecyclerView recyclerView;
    Button buttonAdd;
    EditText editTextAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        editTextAdd = findViewById(R.id.editTextAddToRecycler);

        recyclerView = findViewById(R.id.recyclerView);
        //recyclerView.setHasFixedSize(true);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        buttonAdd = findViewById(R.id.buttonAddToRecycler);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.add(new RecyclerItem(editTextAdd.getText().toString()));
                editTextAdd.setText("");
                adapter.notifyItemInserted(items.size() - 1);
            }
        });
    }

    private class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private List<RecyclerItem> items;

        public ItemAdapter(List<RecyclerItem> items) {
            this.items = items;
        }

        @NonNull
        @NotNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
            //return null;
            return new RecyclerView.ViewHolder(
                    LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.activity_recycler_view_item, parent,false)
            ) {};
        }

        @Override
        public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
            TextView name = holder.itemView.findViewById(R.id.textViewRecyclerItem);
            name.setText(String.format("%s. %s", position, this.items.get(position).getName()));
            Button buttonDel = holder.itemView.findViewById(R.id.buttonRecyclerDel);
            buttonDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    items.remove(position);
                    //adapter.notifyItemRemoved(position);
                    adapter.notifyDataSetChanged();
                }
            });
        }

        @Override
        public int getItemCount() {
            //return 0;
            return this.items.size();
        }
    }
}