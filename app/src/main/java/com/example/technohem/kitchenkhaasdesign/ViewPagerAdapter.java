package com.example.technohem.kitchenkhaasdesign;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/*
** Dot Slide Show
*/

class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.gallery_slider_1,R.drawable.gallery_slider_2,R.drawable.gallery_slider_3,R.drawable.gallery_slider_4,
            R.drawable.gallery_slider_5,R.drawable.gallery_slider_6,R.drawable.gallery_slider_7,R.drawable.gallery_slider_8,
            R.drawable.gallery_slider_9,R.drawable.gallery_slider_10};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout_dot_slide_show, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i = position;

                switch (i) {
                    case 0:
                        Toast.makeText(context, "Slide 1 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(context, "Slide 2 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(context, "Slide 3 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(context, "Slide 4 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(context, "Slide 5 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(context, "Slide 6 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(context, "Slide 7 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(context, "Slide 8 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(context, "Slide 9 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(context, "Slide 10 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}

