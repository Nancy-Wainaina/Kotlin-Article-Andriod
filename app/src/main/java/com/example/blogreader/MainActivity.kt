package com.example.blogreader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvArticle.layoutManager = LinearLayoutManager(this)
        displayArticles()

        }
    fun displayArticles(){
        val blog1 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog2 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog3 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog4 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog5 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog6 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog7 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog8 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog9 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog10 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog11 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
        val blog12 = Article("", "2024-01-01", "Nancy Wainaina", "The Charm", "People usually said about the main character of this book that he was a brave man and he was never afraid of anything. They were wrong. He really was brave, but he knew what fear was, like other people. He had a very important job and even colleagues did not know what kind of man he had been before. In his youth, he was very shy and was afraid to talk to strangers.")
    }
    }
