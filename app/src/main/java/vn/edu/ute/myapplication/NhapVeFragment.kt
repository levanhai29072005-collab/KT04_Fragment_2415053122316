package vn.edu.ute.myapplication
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import vn.edu.ute.myapplication.R

class NhapVeFragment: Fragment() {
    private lateinit var edtHoTen: EditText
    private lateinit var edtSoLuong: EditText
    private lateinit var btnXemVe: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_nhap_ve,container,false)
        edtHoTen=view.findViewById(R.id.edtHoTen)
        edtSoLuong=view.findViewById(R.id.edtSoLuong)
        btnXemVe=view.findViewById(R.id.btnXemVe)
        btnXemVe.setOnClickListener { xemVe_2316() }

        return view
    }
    fun xemVe_2316(){ }
}