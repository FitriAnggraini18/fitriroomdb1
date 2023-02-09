import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fitriroomdb1.R
import com.example.fitriroomdb1.room.Tbsiswa
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EditActivity: AppCompatActivity(){
    val db by lazy { dbsmksa (this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        simpandata()
    }

    fun simpandata(){
        btnInput.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                db.tbsiswaDao().addTbsiswa(
                    Tbsiswa(et_nis.text.toString().toInt(),
                            et_nama.text.toString(),
                            et_kelas.text.toString(),
                            et_alamat.text.toString()
                    )
                )
            }
        }
    }

}



