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
        val view = inflater.inflate(R.layout.fragment_view_image, container, false)

        val imageIds = listOf(
            R.drawable.buffon, R.drawable.varane, R.drawable.ramos,
            R.drawable.marcelo, R.drawable.casemiro, R.drawable.modric,
            R.drawable.kroos, R.drawable.messi, R.drawable.leva2,
            R.drawable.ronaldo
        )

        val viewImage = view.findViewById(R.id.viewImage) as ImageView

        val imageClickListeners = listOf(
            R.id.image1, R.id.image2, R.id.image3, R.id.image4, R.id.image5,
            R.id.image6, R.id.image7, R.id.image8, R.id.image9, R.id.image10
        ).mapIndexed { index, imageId ->
            requireActivity().findViewById<ImageView>(imageId).setOnClickListener {
                viewImage.setImageResource(imageIds[index])
            }
        }

        return view
    }
}
