package com.petra.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class viewImage : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_image, container, false)

        val Image1 = requireActivity().findViewById(R.id.image1) as ImageView
        val Image2 = requireActivity().findViewById(R.id.image2) as ImageView
        val Image3 = requireActivity().findViewById(R.id.image3) as ImageView
        val Image4 = requireActivity().findViewById(R.id.image4) as ImageView
        val Image5 = requireActivity().findViewById(R.id.image5) as ImageView
        val Image6 = requireActivity().findViewById(R.id.image6) as ImageView
        val Image7 = requireActivity().findViewById(R.id.image7) as ImageView
        val Image8 = requireActivity().findViewById(R.id.image8) as ImageView
        val Image9 = requireActivity().findViewById(R.id.image9) as ImageView
        val Image10 = requireActivity().findViewById(R.id.image10) as ImageView

        var viewImage = view.findViewById(R.id.viewImage) as ImageView

        Image1.setOnClickListener(){
            viewImage.setImageResource(R.drawable.buffon)
        }
        Image2.setOnClickListener(){
            viewImage.setImageResource(R.drawable.varane)
        }
        Image3.setOnClickListener(){
            viewImage.setImageResource(R.drawable.ramos)
        }
        Image4.setOnClickListener(){
            viewImage.setImageResource(R.drawable.marcelo)
        }
        Image5.setOnClickListener(){
            viewImage.setImageResource(R.drawable.casemiro)
        }
        Image6.setOnClickListener(){
            viewImage.setImageResource(R.drawable.modric)
        }
        Image7.setOnClickListener(){
            viewImage.setImageResource(R.drawable.kroos)
        }
        Image8.setOnClickListener(){
            viewImage.setImageResource(R.drawable.messi)
        }
        Image9.setOnClickListener(){
            viewImage.setImageResource(R.drawable.leva2)
        }
        Image10.setOnClickListener(){
            viewImage.setImageResource(R.drawable.ronaldo)
        }

        return view
    }





}