/**
* This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
*
* Do not edit this file as changes may cause incorrect behavior and will be lost
* once the code is regenerated.
*
* @generated by codegen project: GeneratePropsJavaInterface.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

public interface RNPDFPdfViewManagerInterface<T extends View> {
  void setPath(T view, @Nullable String value);
  void setPage(T view, int value);
  void setScale(T view, float value);
  void setMinScale(T view, float value);
  void setMaxScale(T view, float value);
  void setHorizontal(T view, boolean value);
  void setEnablePaging(T view, boolean value);
  void setEnableRTL(T view, boolean value);
  void setEnableAnnotationRendering(T view, boolean value);
  void setEnableAntialiasing(T view, boolean value);
  void setFitPolicy(T view, int value);
  void setSpacing(T view, int value);
  void setPassword(T view, @Nullable String value);
  void setSinglePage(T view, boolean value);
  void setFitEachPage(T view, boolean value);
  void setNativePage(T view, int page);
}
