package com.example.recipesguide.ui.favoriterecipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recipesguide.databinding.FragmentFavoriteRecipesBinding


class FavoriteRecipesFragment : Fragment() {
    private lateinit var binding: FragmentFavoriteRecipesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavoriteRecipesBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}