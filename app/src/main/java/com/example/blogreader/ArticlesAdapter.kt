package com.example.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter (var blogSite: List<Article>):RecyclerView.Adapter<BlogViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_list_item ,parent, true)
        return BlogViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val blog = blogSite[position]
        holder.tvName.text = blog.name
        holder.tvDate.text = blog.date
        holder.tvTitle.text  = blog.title
        holder.tvPreview.text = blog.preview
    }

    override fun getItemCount(): Int {
       return blogSite.size
    }
}
class BlogViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    val tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
    val tvContinuation = itemView.findViewById<TextView>(R.id.tvContinuation)

}