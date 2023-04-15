import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubevideo.R
import com.example.youtubevideo.VideoModel

class VideoAdapter internal constructor(private val videoList: List<VideoModel>) :
    RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_view, parent, false)
        return VideoViewHolder(view)
    }
    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.videoWeb.loadData(videoList[position].videoUrl!!, "text/html", "utf-8")
        holder.text.setText(videoList[position].title)
    }
    inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var videoWeb: WebView = itemView.findViewById(R.id.webView)
        var text: TextView = itemView.findViewById(R.id.textview)
        init {
            videoWeb.settings.javaScriptEnabled = true
            videoWeb.webChromeClient = object : WebChromeClient() {
            }
        }
    }
    override fun getItemCount(): Int {
        return videoList.size
    }
}