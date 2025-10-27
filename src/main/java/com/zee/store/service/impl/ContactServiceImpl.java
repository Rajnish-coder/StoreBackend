package com.zee.store.service.impl;

import com.zee.store.dto.ContactRequestDto;
import com.zee.store.entity.Contact;
import com.zee.store.repository.ContactRepository;
import com.zee.store.service.IContactService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ContactServiceImpl implements IContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
        try{
            Contact contact = transformToEntity(contactRequestDto);
            contactRepository.save(contact);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private Contact transformToEntity(ContactRequestDto contactRequestDto) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, contact);
        return contact;
    }
}
