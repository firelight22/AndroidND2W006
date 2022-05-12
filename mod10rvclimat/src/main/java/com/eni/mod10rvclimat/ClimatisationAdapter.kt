package com.eni.mod10rvclimat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eni.mod10rvclimat.databinding.ItemListClimBinding

class ClimatisationAdapter(
    val arraylistClim:ArrayList<Climatisation>,
    val listenerClim : OnClimClickListener
) :
    RecyclerView.Adapter<ClimatisationAdapter.ClimatisationVH>(){
    //Squelette d'un élément de liste
    class ClimatisationVH(val binding: ItemListClimBinding) :
            RecyclerView.ViewHolder(binding.root)

    //Créer le ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClimatisationVH {
        val binding = ItemListClimBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false
        )
        return ClimatisationVH(binding)
    }

    //Comment afficher un élément de ma liste
    override fun onBindViewHolder(holder: ClimatisationVH, position: Int) {
        holder.binding.clim = arraylistClim[position]
        holder.itemView.setOnClickListener {
            listenerClim.onClimClick(arraylistClim[position]) }
    }
    //Récupérer le nombre d'éléments à afficher dans la liste
    override fun getItemCount(): Int = arraylistClim.size

    //OnClimClickLister({Toast(clim.toString)})
    class OnClimClickListener(val listener: (clim:Climatisation) -> Unit){
        fun onClimClick(clim:Climatisation) = listener(clim)
    }

}