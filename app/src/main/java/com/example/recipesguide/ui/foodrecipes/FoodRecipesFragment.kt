package com.example.recipesguide.ui.foodrecipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recipesguide.databinding.FragmentFoodRecipesBinding


class FoodRecipesFragment : Fragment() {
    private lateinit var binding: FragmentFoodRecipesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFoodRecipesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}