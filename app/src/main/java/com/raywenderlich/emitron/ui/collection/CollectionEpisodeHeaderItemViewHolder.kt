package com.raywenderlich.emitron.ui.collection

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.emitron.databinding.ItemCollectionEpisodeHeaderBinding
import com.raywenderlich.emitron.ui.content.ContentItemViewHolder

/**
 * View holder for Episode collection header in Collection detail view
 */
class CollectionEpisodeHeaderItemViewHolder(
  private val binding:
  ItemCollectionEpisodeHeaderBinding
) :
  RecyclerView.ViewHolder(binding.root) {

  /**
   * @param header Episode collection header
   */
  fun bindTo(header: String) {
    binding.title = header
    binding.executePendingBindings()
  }

  companion object {

    /**
     * Factory function to create [ContentItemViewHolder]
     */
    fun create(parent: ViewGroup, layoutId: Int): CollectionEpisodeHeaderItemViewHolder =
      CollectionEpisodeHeaderItemViewHolder(
        DataBindingUtil.inflate(
          LayoutInflater.from(parent.context),
          layoutId, parent, false
        )
      )
  }
}
