package android.kotlin.kotlinmvp.ui.activity

import android.kotlin.kotlinmvp.R
import android.kotlin.kotlinmvp.databinding.ActivityMainBinding
import android.kotlin.kotlinmvp.mvp.presenter.MainPresenter
import android.kotlin.kotlinmvp.mvp.view.MainView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null

    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener {presenter.counterOneClick()}
        vb?.btnCounter2?.setOnClickListener {presenter.counterTwoClick()}
        vb?.btnCounter3?.setOnClickListener {presenter.counterThreeClick()}
    }

    override fun setButtonOneText(text: String) {
       vb?.btnCounter1?.text = text
    }

    override fun setButtonTwoText(text: String) {
        vb?.btnCounter2?.text = text
    }

    override fun setButtonThreeText(text: String) {
        vb?.btnCounter3?.text = text
    }

}