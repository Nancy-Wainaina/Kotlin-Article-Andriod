package com.example.blogreader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  lateinit var binding: ActivityMainBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    binding.rvArticle.layoutManager = LinearLayoutManager(this)
    displayArticles()
    
  }
  
  fun displayArticles() {
    val blog1 = Article(
      "https://plus.unsplash.com/premium_photo-1716259490229-303964fd2e52?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxmZWF0dXJlZC1waG90b3MtZmVlZHw1fHx8ZW58MHx8fHx8https://plus.unsplash.com/premium_photo-1716259490229-303964fd2e52?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxmZWF0dXJlZC1waG90b3MtZmVlZHw1fHx8ZW58MHx8fHx8",
      "2024-01-01",
      "Jane Wainaina",
      "The Charm",
      "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers."
    )
    val blog2 = Article(
      "https://images.unsplash.com/photo-1720457975117-d3f6764358f4?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxmZWF0dXJlZC1waG90b3MtZmVlZHwxMnx8fGVufDB8fHx8fA%3D%3D",
      "2024-01-02",
      "Nancy Wachira",
      "The Charm 2",
      "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers."
    )
    val blog3 = Article(
      "https://images.unsplash.com/photo-1719146913850-f186f411b477?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxmZWF0dXJlZC1waG90b3MtZmVlZHwyMHx8fGVufDB8fHx8fA%3D%3D",
      "2024-01-03",
      "Moses Amolo",
      "The Charm 3",
      "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers."
    )
    val blog4 = Article(
      "https://images.unsplash.com/photo-1720540545397-cda541951963?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxmZWF0dXJlZC1waG90b3MtZmVlZHwyNnx8fGVufDB8fHx8fA%3D%3D",
      "2024-01-04",
      "Keith Wanyama",
      "The Charm 4",
      "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers."
    )
    val blog5 = Article(
      "https://images.unsplash.com/photo-1718068769782-b76cda287298?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxmZWF0dXJlZC1waG90b3MtZmVlZHwzNnx8fGVufDB8fHx8fA%3D%3D",
      "2024-01-05",
      "Penny K.",
      "The Charm 5",
      "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers."
    )
    val blog6 = Article(
      "https://images.unsplash.com/photo-1720356778355-d5cf60726726?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxmZWF0dXJlZC1waG90b3MtZmVlZHw1N3x8fGVufDB8fHx8fA%3D%3D",
      "2024-01-06",
      "Abe Gabriel",
      "The Charm 6",
      "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers."
    )
    val blog7 = Article(
      "https://plus.unsplash.com/premium_photo-1718503746396-2e9e30e802d1?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxmZWF0dXJlZC1waG90b3MtZmVlZHw2Nnx8fGVufDB8fHx8fA%3D%3D",
      "2024-01-07",
      "Mike Tit0",
      "The Charm 7",
      "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers."
    )
    
    val articles = listOf(blog1, blog2, blog3, blog4, blog5, blog6, blog7)
    val articlesAdapter = ArticlesAdapter(articles)
    binding.rvArticle.adapter = articlesAdapter
  }
}
