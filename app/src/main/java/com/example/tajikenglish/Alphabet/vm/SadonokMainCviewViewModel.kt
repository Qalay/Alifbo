package com.encom.dynamicview.vm

import androidx.lifecycle.ViewModel
import com.encom.dynamicview.repository.AlphabetMainCviewRepository
import com.encom.dynamicview.repository.HamsadoMainCviewRepository
import com.encom.dynamicview.repository.SadonokMainCviewRepository
import com.encom.dynamicview.repository.model.AlphabetButtonModel

/**
 * Created by ABDUAHAD FAIZULLOEV on 26,сентябрь,2021
 * abduahad.fayzulloev@gmail.com
 * http://abduahad.com/
 *
 */
class SadonokMainCviewViewModel:ViewModel(){
   private val cviewRepositoryAlphabet:SadonokMainCviewRepository = SadonokMainCviewRepository()

   fun getAlphabets():ArrayList<AlphabetButtonModel>{
       return cviewRepositoryAlphabet.getAlphabet()
   }
}