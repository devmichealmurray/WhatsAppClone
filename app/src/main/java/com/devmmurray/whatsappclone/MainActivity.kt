package com.devmmurray.whatsappclone

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainActivity : AppCompatActivity() {

    private var mSectionsPagerAdapter: SectionPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        mSectionsPagerAdapter = SectionPagerAdapter(supportFragmentManager)
        container.adapter = mSectionsPagerAdapter

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with action", Snackbar.LENGTH_SHORT)
                .setAction("Action", null)
                .show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId
        if (id == R.id.action_settings) true
        return super.onOptionsItemSelected(item)
    }

    inner class SectionPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return PlaceholderFragment.newIntent(position + 1)
        }

        override fun getCount(): Int {
            return 3
        }

    }

    class PlaceholderFragment: Fragment() {
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val rootView = inflater.inflate(R.layout.fragment_main, container, false)
            val args = arguments?.getString(ARG_SECTION_NUMBER)
            val newText = "Hello From Section $args"
            rootView.section_label.text = newText
            return rootView
        }

        companion object {
            private const val ARG_SECTION_NUMBER ="Section_Number"

            fun newIntent(sectionNumber: Int): PlaceholderFragment {
                val fragment = PlaceholderFragment()
                val args = Bundle()
                args.putInt(ARG_SECTION_NUMBER, sectionNumber)
                fragment.arguments = args
                return fragment
            }
        }
    }
}