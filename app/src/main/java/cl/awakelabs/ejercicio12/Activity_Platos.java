package cl.awakelabs.ejercicio12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cl.awakelabs.ejercicio12.databinding.ActivityMainBinding;
import cl.awakelabs.ejercicio12.databinding.ActivityPlatosBinding;

public class Activity_Platos extends AppCompatActivity {
    private  ActivityPlatosBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlatosBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<String> listMenu = new ArrayList<>();

        listMenu.add("Combo Hamburguesa");
        listMenu.add("Combo Completos");
        listMenu.add("Colacion Ejecutivo");
        listMenu.add("Pollo con Papas Fritas");
        listMenu.add("Asado a la olla con puré");
    }
}