package personal.pol.sanejove.scrollable_list_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import okhttp3.OkHttpClient
import personal.pol.sanejove.scrollable_list_app.adapter.ItemAdapter
import personal.pol.sanejove.scrollable_list_app.data.Datasource
import personal.pol.sanejove.scrollable_list_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding;

    private lateinit var httpClient : OkHttpClient;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val affirmationsDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this,affirmationsDataset)

        recyclerView.setHasFixedSize(true)


    }
}