package io.farah.authentication.security;

import io.farah.authentication.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository repository;
    @Override
    @Transactional //to load the roles when loading the user
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        return repository.findUserByEmail(userEmail).orElseThrow(() -> new UsernameNotFoundException("user not found"));
    }
}
