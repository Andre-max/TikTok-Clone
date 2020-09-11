package com.andre_max.tiktokclone.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.andre_max.tiktokclone.R
import com.andre_max.tiktokclone.databinding.FragmentProfileWithoutAccountBinding
import timber.log.Timber


class ProfileWithoutAccountFragment : Fragment() {

    lateinit var binding: FragmentProfileWithoutAccountBinding
//    lateinit var signUpPageBinding: SignUpPageBinding
//
//    lateinit var callbackManager: CallbackManager
//    lateinit var mTwitterBtn: TwitterLoginButton
//    lateinit var mGoogleSignInClient: GoogleSignInClient

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.d("Home fragment created")
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_profile_without_account, container, false)
//        signUpPageBinding = DataBindingUtil.inflate(layoutInflater, R.layout.sign_up_page, container, false)

        binding.signUpBtn.setOnClickListener {
            setSignUpPage()
        }


        return binding.root
    }

    private fun setSignUpPage(){
//        binding.signUpBtn.visibility = View.GONE
//        binding.signUpPage.root.visibility = View.VISIBLE

        findNavController().navigate(R.id.action_meFragment_to_signUpFragment)

    }



}



//        val EMAIL = "email"

//        val fbLogin = root.findViewById(R.id.login_button) as LoginButton
//        fbLogin.setReadPermissions(listOf(EMAIL))
//        fbLogin.fragment = this
        // If you are using in ViewHolder fragment, call fbLogin.setFragment(this);

        // Callback registration
        // If you are using in ViewHolder fragment, call fbLogin.setFragment(this);
//
//        // Callback registration
//        fbLogin.registerCallback(callbackManager, object : FacebookCallback<LoginResult> {
//            override fun onSuccess(loginResult: LoginResult) {
//                Log.d(TAG, "facebook:onSuccess:$loginResult")
//                handleFacebookAccessToken(loginResult.accessToken)
//            }
//
//            override fun onCancel() {
//                // App code
//            }
//
//            override fun onError(exception: FacebookException) {
//                // App code
//            }
//        })
//
//        return root
//    }
//
//    private fun handleFacebookAccessToken(token: AccessToken){
//        val credential = FacebookAuthProvider.getCredential(token.token)
//        firebaseAuth.signInWithCredential(credential)
//            .addOnCompleteListener(this.requireActivity()) { task ->
//                if (task.isSuccessful) {
//                    // Sign in success, update UI with the signed-in user's information
//                    Log.d(TAG, "signInWithCredential:success with ${firebaseAuth.currentUser}")
//                    val user = firebaseAuth.currentUser
////                    Timber.d("")
////                    updateUI(user)
//                } else {
//                    // If sign in fails, display ViewHolder message to the user.
//                    Log.w(TAG, "signInWithCredential:failure", task.exception)
//                    Toast.makeText(this.requireContext(), "Authentication failed.",
//                        Toast.LENGTH_SHORT).show()
////                    updateUI(null)
//                }
//
//                // ...
//            }
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        callbackManager.onActivityResult(requestCode, resultCode, data)
//    }
//}

//
//        val providers = listOf(
//            AuthUI.IdpConfig.EmailBuilder().build(),
//            AuthUI.IdpConfig.GoogleBuilder().build(),
//            AuthUI.IdpConfig.FacebookBuilder().build(),
//            AuthUI.IdpConfig.TwitterBuilder().build(),
//            AuthUI.IdpConfig.PhoneBuilder().build()
//        )
//
//        startActivityForResult(
//            AuthUI.getInstance()
//                .createSignInIntentBuilder()
//                .setIsSmartLockEnabled(true)
//                .setLogo(R.drawable.ic_launcher_foreground)
//                .setAvailableProviders(providers)
//                .setTosAndPrivacyPolicyUrls(
//                    "https://www.tiktok.com/legal/terms-of-use?lang=en",
//                    "https://www.tiktok.com/legal/privacy-policy?lang=en"
//                )
//                .build(), RC_SIGN_IN
//        )
