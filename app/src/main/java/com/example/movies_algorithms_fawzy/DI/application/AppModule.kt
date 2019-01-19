package com.example.movies_algorithms_fawzy.DI.application
import android.content.Context
import com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader
import com.example.movies_algorithms_fawzy.Common.imagehelper.PicassoImageLoader
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named
import javax.inject.Singleton


@Module
class AppModule constructor(context: Context){

    private val appContext = context.applicationContext

    @Singleton
    @Provides
    fun provideAppContext(): Context {
        return appContext
    }
    @Singleton
    @Provides
    fun provideImageLoader(context: Context) : ImageLoader {
        return PicassoImageLoader(Picasso.with(context))
    }


}
