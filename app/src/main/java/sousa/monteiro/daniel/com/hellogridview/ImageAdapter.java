package sousa.monteiro.daniel.com.hellogridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by Daniel Monteiro on 10/02/16.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length; //A quantidade de items máxima que o GridView vai ter(a mesma quantidade de imagens do array de imagens)
    }

    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // cria uma nova imagem referenciando a cada item no grid view
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if(convertView == null) {
            //Cria cada item com seus detalhes...
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(750,750)); //largura e altura do(s) item(s) do grid view
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]); //Adiciona a imagem no item, tirando do array

        parent.setAlpha(0.75F); // Deixa o GridView inteiro com 25% de transparência.

        return imageView;
    }

    private Integer[] mThumbIds = { //Array de imagens(tiradas de 500px.com)
            R.drawable.sample_3, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_1, R.drawable.sample_3,
            R.drawable.sample_3, R.drawable.sample_2,
            R.drawable.sample_2, R.drawable.sample_1,
            R.drawable.sample_1, R.drawable.sample_3,
            R.drawable.sample_2, R.drawable.sample_backgound,
    };
}
