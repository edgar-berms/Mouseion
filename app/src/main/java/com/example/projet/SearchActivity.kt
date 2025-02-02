import android.graphics.Color
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import com.example.projet.R

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val searchView = findViewById<SearchView>(R.id.search_view)

        // Changer la couleur du texte et du hint
        val searchEditText = searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
        searchEditText.setTextColor(Color.WHITE)  // Texte en blanc
        searchEditText.setHintTextColor(Color.GRAY)  // Hint en gris

        // Modifier la couleur de l'icône de loupe
        val searchIcon = searchView.findViewById<ImageView>(androidx.appcompat.R.id.search_mag_icon)
        searchIcon.setColorFilter(ContextCompat.getColor(this, R.color.ivory))
    }
}
