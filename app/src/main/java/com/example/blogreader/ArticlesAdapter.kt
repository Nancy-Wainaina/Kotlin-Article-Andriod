package com.example.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.blogreader.databinding.BlogListItemBinding
import com.squareup.picasso.Picasso

class ArticlesAdapter (var blogSite: List<Article>):RecyclerView.Adapter<BlogViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
       val binding = BlogListItemBinding
           .inflate(LayoutInflater.from(parent.context), parent, false)
        return BlogViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val blog = blogSite[position]
        holder.binding.tvName.text = blog.name
        holder.binding.tvDate.text = blog.date
        holder.binding.tvTitle.text  = blog.title
        holder.binding.tvPreview.text = blog.preview.substring(0,100)
        
        Picasso
            .get()
            .load(blog.image)
            .resize(360, 240)
            .centerCrop()
            .into(holder.binding.ivArticlePhoto)
    }

    override fun getItemCount(): Int {
       return blogSite.size
    }
}
class BlogViewHolder(val binding: BlogListItemBinding)
    :RecyclerView.ViewHolder(binding.root)