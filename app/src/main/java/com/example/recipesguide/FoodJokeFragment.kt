package com.example.recipesguide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recipesguide.databinding.FragmentFoodJokeBinding


class FoodJokeFragment : Fragment() {
    private lateinit var binding: FragmentFoodJokeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFoodJokeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}