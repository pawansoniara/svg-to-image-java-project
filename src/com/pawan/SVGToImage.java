package com.pawan;

import org.apache.batik.transcoder.image.JPEGTranscoder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;

public class SVGToImage {
	 public static void main(String[] args) throws Exception {

	        // Create a JPEG transcoder
	        JPEGTranscoder t = new JPEGTranscoder();

	        // Set the transcoding hints.
	        t.addTranscodingHint(JPEGTranscoder.KEY_QUALITY, new Float(.8));

	        // Create the transcoder input.
	        String svgURI = new File("C:/Users/bursys/Downloads/batik-bin-1.12.tar/batik-1.12/samples/batikCandy.svg").toURL().toString();
	        TranscoderInput input = new TranscoderInput(svgURI);

	        // Create the transcoder output.
	        OutputStream ostream = new FileOutputStream("C:/Users/bursys/Downloads/batik-bin-1.12.tar/batik-1.12/out.jpg");
	        TranscoderOutput output = new TranscoderOutput(ostream);

	        // Save the image.
	        t.transcode(input, output);

	        // Flush and close the stream.
	        ostream.flush();
	        ostream.close();
	        System.exit(0);
	    }
}
