package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEntreeMenuBindingImpl extends FragmentEntreeMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.entree_options, 15);
        sViewsWithIds.put(R.id.divider, 16);
        sViewsWithIds.put(R.id.subtotal, 17);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEntreeMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentEntreeMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[13]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[16]
            , (android.widget.RadioGroup) bindings[15]
            , (android.widget.Button) bindings[14]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[17]
            );
        this.cancelButton.setTag(null);
        this.cauliflower.setTag(null);
        this.cauliflowerDescription.setTag(null);
        this.cauliflowerPrice.setTag(null);
        this.chili.setTag(null);
        this.chiliDescription.setTag(null);
        this.chiliPrice.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.pasta.setTag(null);
        this.pastaDescription.setTag(null);
        this.pastaPrice.setTag(null);
        this.skillet.setTag(null);
        this.skilletDescription.setTag(null);
        this.skilletPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback15 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback19 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback16 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback14 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback18 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.entreeMenuFragment == variableId) {
            setEntreeMenuFragment((com.example.lunchtray.ui.order.EntreeMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEntreeMenuFragment(@Nullable com.example.lunchtray.ui.order.EntreeMenuFragment EntreeMenuFragment) {
        this.mEntreeMenuFragment = EntreeMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.entreeMenuFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelMenuItemsChiliGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsCauliflowerName = null;
        java.lang.String viewModelMenuItemsSkilletGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsPastaGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsPastaDescription = null;
        java.lang.String viewModelMenuItemsPastaName = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsPasta = null;
        java.lang.String viewModelMenuItemsSkilletName = null;
        java.lang.String viewModelMenuItemsCauliflowerDescription = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        java.lang.String viewModelMenuItemsCauliflowerGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsChiliName = null;
        com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsChili = null;
        java.lang.String viewModelMenuItemsSkilletDescription = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsCauliflower = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsSkillet = null;
        java.lang.String viewModelMenuItemsChiliDescription = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (viewModel != null) {
                    // read viewModel.menuItems
                    viewModelMenuItems = viewModel.getMenuItems();
                }


                if (viewModelMenuItems != null) {
                    // read viewModel.menuItems["pasta"]
                    viewModelMenuItemsPasta = viewModelMenuItems.get("pasta");
                    // read viewModel.menuItems["chili"]
                    viewModelMenuItemsChili = viewModelMenuItems.get("chili");
                    // read viewModel.menuItems["cauliflower"]
                    viewModelMenuItemsCauliflower = viewModelMenuItems.get("cauliflower");
                    // read viewModel.menuItems["skillet"]
                    viewModelMenuItemsSkillet = viewModelMenuItems.get("skillet");
                }


                if (viewModelMenuItemsPasta != null) {
                    // read viewModel.menuItems["pasta"].getFormattedPrice()
                    viewModelMenuItemsPastaGetFormattedPrice = viewModelMenuItemsPasta.getFormattedPrice();
                    // read viewModel.menuItems["pasta"].description
                    viewModelMenuItemsPastaDescription = viewModelMenuItemsPasta.getDescription();
                    // read viewModel.menuItems["pasta"].name
                    viewModelMenuItemsPastaName = viewModelMenuItemsPasta.getName();
                }
                if (viewModelMenuItemsChili != null) {
                    // read viewModel.menuItems["chili"].getFormattedPrice()
                    viewModelMenuItemsChiliGetFormattedPrice = viewModelMenuItemsChili.getFormattedPrice();
                    // read viewModel.menuItems["chili"].name
                    viewModelMenuItemsChiliName = viewModelMenuItemsChili.getName();
                    // read viewModel.menuItems["chili"].description
                    viewModelMenuItemsChiliDescription = viewModelMenuItemsChili.getDescription();
                }
                if (viewModelMenuItemsCauliflower != null) {
                    // read viewModel.menuItems["cauliflower"].name
                    viewModelMenuItemsCauliflowerName = viewModelMenuItemsCauliflower.getName();
                    // read viewModel.menuItems["cauliflower"].description
                    viewModelMenuItemsCauliflowerDescription = viewModelMenuItemsCauliflower.getDescription();
                    // read viewModel.menuItems["cauliflower"].getFormattedPrice()
                    viewModelMenuItemsCauliflowerGetFormattedPrice = viewModelMenuItemsCauliflower.getFormattedPrice();
                }
                if (viewModelMenuItemsSkillet != null) {
                    // read viewModel.menuItems["skillet"].getFormattedPrice()
                    viewModelMenuItemsSkilletGetFormattedPrice = viewModelMenuItemsSkillet.getFormattedPrice();
                    // read viewModel.menuItems["skillet"].name
                    viewModelMenuItemsSkilletName = viewModelMenuItemsSkillet.getName();
                    // read viewModel.menuItems["skillet"].description
                    viewModelMenuItemsSkilletDescription = viewModelMenuItemsSkillet.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback18);
            this.cauliflower.setOnClickListener(mCallback14);
            this.chili.setOnClickListener(mCallback15);
            this.nextButton.setOnClickListener(mCallback19);
            this.pasta.setOnClickListener(mCallback16);
            this.skillet.setOnClickListener(mCallback17);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflower, viewModelMenuItemsCauliflowerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflowerDescription, viewModelMenuItemsCauliflowerDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflowerPrice, viewModelMenuItemsCauliflowerGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chili, viewModelMenuItemsChiliName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chiliDescription, viewModelMenuItemsChiliDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chiliPrice, viewModelMenuItemsChiliGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pasta, viewModelMenuItemsPastaName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pastaDescription, viewModelMenuItemsPastaDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pastaPrice, viewModelMenuItemsPastaGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skillet, viewModelMenuItemsSkilletName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skilletDescription, viewModelMenuItemsSkilletDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skilletPrice, viewModelMenuItemsSkilletGetFormattedPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel.menuItems != null
                boolean viewModelMenuItemsJavaLangObjectNull = false;
                // viewModel.menuItems["skillet"] != null
                boolean viewModelMenuItemsSkilletJavaLangObjectNull = false;
                // viewModel.menuItems["skillet"].name
                java.lang.String viewModelMenuItemsSkilletName = null;
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.menuItems["skillet"]
                com.example.lunchtray.model.MenuItem viewModelMenuItemsSkillet = null;
                // viewModel.menuItems
                java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelMenuItems = viewModel.getMenuItems();

                    viewModelMenuItemsJavaLangObjectNull = (viewModelMenuItems) != (null);
                    if (viewModelMenuItemsJavaLangObjectNull) {



                        viewModelMenuItemsSkillet = viewModelMenuItems.get("skillet");

                        viewModelMenuItemsSkilletJavaLangObjectNull = (viewModelMenuItemsSkillet) != (null);
                        if (viewModelMenuItemsSkilletJavaLangObjectNull) {


                            viewModelMenuItemsSkilletName = viewModelMenuItemsSkillet.getName();

                            viewModel.setEntree(viewModelMenuItemsSkilletName);
                        }
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel.menuItems["chili"]
                com.example.lunchtray.model.MenuItem viewModelMenuItemsChili = null;
                // viewModel.menuItems != null
                boolean viewModelMenuItemsJavaLangObjectNull = false;
                // viewModel.menuItems["chili"].name
                java.lang.String viewModelMenuItemsChiliName = null;
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.menuItems
                java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
                // viewModel.menuItems["chili"] != null
                boolean viewModelMenuItemsChiliJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelMenuItems = viewModel.getMenuItems();

                    viewModelMenuItemsJavaLangObjectNull = (viewModelMenuItems) != (null);
                    if (viewModelMenuItemsJavaLangObjectNull) {



                        viewModelMenuItemsChili = viewModelMenuItems.get("chili");

                        viewModelMenuItemsChiliJavaLangObjectNull = (viewModelMenuItemsChili) != (null);
                        if (viewModelMenuItemsChiliJavaLangObjectNull) {


                            viewModelMenuItemsChiliName = viewModelMenuItemsChili.getName();

                            viewModel.setEntree(viewModelMenuItemsChiliName);
                        }
                    }
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // entreeMenuFragment
                com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // entreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.goToNextScreen();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel.menuItems["pasta"].name
                java.lang.String viewModelMenuItemsPastaName = null;
                // viewModel.menuItems != null
                boolean viewModelMenuItemsJavaLangObjectNull = false;
                // viewModel.menuItems["pasta"]
                com.example.lunchtray.model.MenuItem viewModelMenuItemsPasta = null;
                // viewModel.menuItems["pasta"] != null
                boolean viewModelMenuItemsPastaJavaLangObjectNull = false;
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.menuItems
                java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelMenuItems = viewModel.getMenuItems();

                    viewModelMenuItemsJavaLangObjectNull = (viewModelMenuItems) != (null);
                    if (viewModelMenuItemsJavaLangObjectNull) {



                        viewModelMenuItemsPasta = viewModelMenuItems.get("pasta");

                        viewModelMenuItemsPastaJavaLangObjectNull = (viewModelMenuItemsPasta) != (null);
                        if (viewModelMenuItemsPastaJavaLangObjectNull) {


                            viewModelMenuItemsPastaName = viewModelMenuItemsPasta.getName();

                            viewModel.setEntree(viewModelMenuItemsPastaName);
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.menuItems["cauliflower"] != null
                boolean viewModelMenuItemsCauliflowerJavaLangObjectNull = false;
                // viewModel.menuItems["cauliflower"].name
                java.lang.String viewModelMenuItemsCauliflowerName = null;
                // viewModel.menuItems != null
                boolean viewModelMenuItemsJavaLangObjectNull = false;
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel.menuItems["cauliflower"]
                com.example.lunchtray.model.MenuItem viewModelMenuItemsCauliflower = null;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.menuItems
                java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelMenuItems = viewModel.getMenuItems();

                    viewModelMenuItemsJavaLangObjectNull = (viewModelMenuItems) != (null);
                    if (viewModelMenuItemsJavaLangObjectNull) {



                        viewModelMenuItemsCauliflower = viewModelMenuItems.get("cauliflower");

                        viewModelMenuItemsCauliflowerJavaLangObjectNull = (viewModelMenuItemsCauliflower) != (null);
                        if (viewModelMenuItemsCauliflowerJavaLangObjectNull) {


                            viewModelMenuItemsCauliflowerName = viewModelMenuItemsCauliflower.getName();

                            viewModel.setEntree(viewModelMenuItemsCauliflowerName);
                        }
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // entreeMenuFragment
                com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // entreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.cancelOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): entreeMenuFragment
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}