package com.anatoliyvinokurov.rubikscube

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Fragment class representing Step 6 of the process.
 */
class Step6Fragment : Fragment() {
    /**
     * Called to create the view hierarchy associated with the fragment.
     *
     * @param inflater           The LayoutInflater object that can be used to inflate any views
     * @param container          The parent view that the fragment's UI should be attached to
     * @param savedInstanceState If non-null, this fragment is being re-constructed from a previous saved state
     * @return The View for the fragment's UI, or null
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.layout_step6, container, false
        )
    }
}