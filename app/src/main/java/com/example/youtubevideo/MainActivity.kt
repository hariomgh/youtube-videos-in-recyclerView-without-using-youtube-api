package com.example.youtubevideo
import VideoAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    private var videosList = ArrayList<VideoModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        title = "Youtube Video Player"
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        videosList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +
                ".youtube.com/embed/m6TWA16Rh3U\" frameborder=\"0\" allowfullscreen></iframe>","Image Opacity"))
        videosList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +
                ".youtube.com/embed/uF3i9_fzepo\" frameborder=\"0\" allowfullscreen></iframe>","Send SMS"))
        videosList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +
                ".youtube.com/embed/mRnFFTgGGTY\" frameborder=\"0\" allowfullscreen></iframe>","RecyclerView Android"))
        videosList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +
                ".youtube.com/embed/PMIHDMY1bWo\" frameborder=\"0\" allowfullscreen></iframe>", "Webview Android"))
        val videoAdapter = VideoAdapter(videosList)
        recyclerView.adapter = videoAdapter
    }
}