package com.quvideo.application.gallery.adapterhelper.listener;

import android.view.View;
import com.quvideo.application.gallery.adapterhelper.BaseQuickAdapter;

/**
 * A convenience class to extend when you only want to OnItemClickListener for a subset
 * of all the SimpleClickListener. This implements all methods in the
 * {@link SimpleClickListener}
 */
public abstract class OnItemClickListener extends SimpleClickListener {
  @Override
  public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
    onSimpleItemClick(adapter, view, position);
  }

  @Override
  public void onItemLongClick(BaseQuickAdapter adapter, View view, int position) {

  }

  @Override
  public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {

  }

  @Override
  public void onItemChildLongClick(BaseQuickAdapter adapter, View view, int position) {

  }

  public abstract void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position);
}
