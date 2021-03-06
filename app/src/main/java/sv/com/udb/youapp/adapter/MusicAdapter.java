package sv.com.udb.youapp.adapter;

import android.view.View;

import androidx.annotation.NonNull;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import sv.com.udb.youapp.R;
import sv.com.udb.youapp.databinding.AdapterMusicBinding;
import sv.com.udb.youapp.dto.Music;
import sv.com.udb.youapp.interfaces.OnItemClickListener;
import sv.com.udb.youapp.interfaces.OnLongItemClickListener;

public class MusicAdapter extends AbstractAdapter<Music, MusicAdapter.MusicViewHolder> {
    public MusicAdapter(List<Music> payload) {
        super(R.layout.adapter_music, payload);
    }

    public MusicAdapter(List<Music> payload, OnItemClickListener<Music> onItemClickListener){
        super(R.layout.adapter_music,payload,onItemClickListener);
    }

    public static class MusicViewHolder extends AbstractViewHolder<Music> {

        private AdapterMusicBinding binding;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = AdapterMusicBinding.bind(itemView);
        }

        @Override
        public void bind(Music payload) {
            binding.txtTitle.setText(payload.getTitle());
            binding.txtAuthor.setText(payload.getUser().getNombres());
            Picasso.get().load(payload.getPhoto()).into(binding.imageView);
        }
    }

}
