package com.kominfo.disabilityinformationsystem

import android.os.Bundle
import android.view.*
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.kominfo.disabilityinformationsystem.databinding.FragmentTwitterBinding


class TwitterFragment : Fragment() {

    private var _binding: FragmentTwitterBinding? = null
    private val binding get() = _binding!!

    val TAG = "TimeLineActivity"

    private val baseURl = "http://twitter.com"

    private val widgetInfo =
        "<a class=\"twitter-timeline\" href=\"https://twitter.com/DiskominfoMKS?ref_src=twsrc%5Etfw\">Tweets by DiskominfoMKS</a>" +
                " <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTwitterBinding.inflate(inflater,container,false)

        val webView = binding.timelineWebview
        val bar = binding.progressBar

        webView.setBackgroundColor(0);
        webView.settings.domStorageEnabled = true
        webView.settings.javaScriptEnabled = true

        webView.loadDataWithBaseURL(baseURl, widgetInfo, "text/html", "UTF-8", null)

        //both code still proceed when loading is in progress
        webView.webViewClient = object: WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }

        }

        webView.webChromeClient = object: WebChromeClient(){
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if (newProgress >= 100){
                    bar.visibility = View.GONE
                    webView.visibility = View.VISIBLE
                }

            }
        }

        return binding.root
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return true
    }




}