package com.andre_max.tiktokclone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.andre_max.tiktokclone.databinding.FragmentMeBinding
import com.andre_max.tiktokclone.ui.ProfileWithAccountFragment
import com.andre_max.tiktokclone.ui.ProfileWithoutAccountFragment


class MeFragment : Fragment() {

    lateinit var binding: FragmentMeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_me, container, false)

        this.requireActivity().supportFragmentManager.beginTransaction()
            .add(R.id.frag_container, if (firebaseAuth.currentUser == null) ProfileWithoutAccountFragment() else ProfileWithAccountFragment())
            .commit()

        return binding.root
    }

}
